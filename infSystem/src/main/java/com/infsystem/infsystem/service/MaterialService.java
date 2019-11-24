/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.service;

import com.infsystem.infsystem.common.Unit;
import static com.infsystem.infsystem.databse.jooq.model.tables.Material.MATERIAL;
import static com.infsystem.infsystem.databse.jooq.model.tables.MaterialCategory.MATERIAL_CATEGORY;
import static com.infsystem.infsystem.databse.jooq.model.tables.MaterialSuplier.MATERIAL_SUPLIER;
import static com.infsystem.infsystem.databse.jooq.model.tables.Person.PERSON;
import static com.infsystem.infsystem.databse.jooq.model.tables.Personviewrepository.PERSONVIEWREPOSITORY;
import static com.infsystem.infsystem.databse.jooq.model.tables.Supplierviewrepository.SUPPLIERVIEWREPOSITORY;
import com.infsystem.infsystem.databse.jooq.model.tables.records.MaterialRecord;
import com.infsystem.infsystem.model.MaterialEditModel;
import com.infsystem.infsystem.model.NameIdModel;
import java.sql.SQLException;
import java.util.List;
import org.jooq.impl.DSL;

/**
 *
 * @author dxdjf
 */
public class MaterialService implements IMaterialService {

    private Unit unit;

    public MaterialService() throws SQLException {
        this.unit = new Unit();
    }

    @Override
    public List<NameIdModel> getMaterialCategory() {
        List<NameIdModel> materialCategory = unit.get().select().from(MATERIAL_CATEGORY).fetch().into(NameIdModel.class);
        return materialCategory;
    }

    @Override
    public String save(MaterialEditModel model) {
        try {
            unit.get().transaction(config -> {
                MaterialRecord material = DSL.using(config)
                        .insertInto(
                                MATERIAL,
                                MATERIAL.NAME,
                                MATERIAL.CATEGORYID,
                                MATERIAL.AVAILABLEQTY,
                                MATERIAL.PENDINGQTY,
                                MATERIAL.BRAND
                        )
                        .values(
                                model.name,
                                model.categoryId,
                                model.availableQty,
                                model.pendingQty,
                                model.brand
                        ).returning().fetchOne();
                model.materialSuplier.forEach(s -> {

                    DSL.using(config)
                            .insertInto(
                                    MATERIAL_SUPLIER,
                                    MATERIAL_SUPLIER.MATERIALID,
                                    MATERIAL_SUPLIER.SUPLIERID,
                                    MATERIAL_SUPLIER.PRICE
                            )
                            .values(
                                    material.getId(),
                                    s.suplierId,
                                    100//s.price
                            ).execute();
                });
            });
            return "Material Added";
        } catch (Exception e) {
            return "Material not added";
        }
    }

    @Override
    public List<NameIdModel> getMaterialSuplier() {
        List<NameIdModel> material_suplier = unit.get().select().from(SUPPLIERVIEWREPOSITORY).fetch().into(NameIdModel.class);
        return material_suplier;
    }

}

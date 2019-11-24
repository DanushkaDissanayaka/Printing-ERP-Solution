/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.service;

import com.infsystem.infsystem.common.Unit;
import static com.infsystem.infsystem.databse.jooq.model.Tables.*;
import com.infsystem.infsystem.databse.jooq.model.tables.records.PersonRecord;
import com.infsystem.infsystem.model.NameIdModel;
import com.infsystem.infsystem.model.PersonEditModel;
import java.sql.SQLException;
import java.util.List;
import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.insertInto;

/**
 *
 * @author dxdjf
 */
public class UserService implements IUserService {

    private Unit unit;

    public UserService() throws SQLException {
        this.unit = new Unit();
    }

    @Override
    public List<NameIdModel> getUserType() {
        List<NameIdModel> userType = unit.get().select().from(PERSONTYPE).fetch().into(NameIdModel.class);
        return userType;
    }

    @Override
    public List<NameIdModel> getAddressType() {
        List<NameIdModel> addressType = unit.get().select().from(ADDRESSTYPE).fetch().into(NameIdModel.class);
        return addressType;
    }

    @Override
    public List<NameIdModel> getUserStatus() {
        List<NameIdModel> userStatus = unit.get().select().from(STATE).fetch().into(NameIdModel.class);
        return userStatus;
    }

    @Override
    public String createPerson(PersonEditModel model) {
        try {

            unit.get().transaction(config -> {
                PersonRecord person = DSL.using(config)
                        .insertInto(
                                PERSON,
                                PERSON.FNAME,
                                PERSON.LNAME,
                                PERSON.DOB,
                                PERSON.NIC,
                                PERSON.EMAIL,
                                PERSON.TYPE,
                                PERSON.STATUS
                        )
                        .values(
                                model.fName,
                                model.lName,
                                model.dob,
                                model.nic,
                                model.email,
                                model.type,
                                1
                                //model.status
                        )
                        .returning().fetchOne();
                model.contact.forEach(c -> {
                    DSL.using(config).insertInto(TELIPHONE, TELIPHONE.ID, TELIPHONE.NUMBER).values(person.getId(), c.number).execute();
                });
                model.address.forEach(a -> {
                    DSL.using(config).
                            insertInto(
                                    ADDRESS, 
                                    ADDRESS.ID,
                                    ADDRESS.ADDRESSNO,
                                    ADDRESS.ADDRESSSTREET1,
                                    ADDRESS.ADDRESSSTREET2,
                                    ADDRESS.ADDRESSSTREET3,
                                    ADDRESS.ADDRESSCITY,
                                    ADDRESS.ADDRESSCOUNTRY,
                                    ADDRESS.TYPE
                            )
                            .values(
                                    person.getId(),
                                    a.getNo(),
                                    a.getAddress1(),
                                    a.getAddress2(),
                                    a.getAddress3(),
                                    a.getCity(),
                                    a.country,
                                    a.type
                            ).execute();
                });
            });
            return "Person added";
        } catch (Exception e) {
            System.out.println(e);
            return "Person not Added";
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 *
 * @author dxdjf
 */
public class Unit {

    private static final String user = "root";
    private static final String password = "password";
    private static final String url = "jdbc:mysql://localhost:3306/inf?serverTimezone=UTC";
    private final Connection connection;

    public Unit() throws SQLException {
        this.connection = DriverManager.getConnection(url, user, password);
    }
    
    public DSLContext get(){
        DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL);
        return dslContext;
    }

}

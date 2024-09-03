package org.examle.libtest.config;

import org.hibernate.dialect.Dialect;

import java.sql.Types;

import static java.sql.Types.*;

public class SQLDialect extends Dialect {
    public SQLDialect() {
        registerColumnType(BIT, "integer");
    }
}

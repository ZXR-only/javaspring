package com.zxr.DtSql;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class phonesDT {
    public String queryPhoneId(Map<String,Integer> map){
        return new SQL(){
            {
                SELECT("pid,pname");
                FROM("phones p");
                if (map.get("pid") != null) {
                    WHERE("p.pid=#{pid}");
                }
            }
        }.toString();

    }
}

package com.zxr.mapper;

import com.zxr.model.Retailers;
import com.zxr.model.RetailersExample.Criteria;
import com.zxr.model.RetailersExample.Criterion;
import com.zxr.model.RetailersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RetailersSqlProvider {

    public String countByExample(RetailersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("retailers");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RetailersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("retailers");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Retailers record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("retailers");
        
        if (record.get����������() != null) {
            sql.VALUES("����������", "#{����������,jdbcType=CHAR}");
        }
        
        if (record.get�ṩ��Ʒ() != null) {
            sql.VALUES("�ṩ��Ʒ", "#{�ṩ��Ʒ,jdbcType=CHAR}");
        }
        
        if (record.get���() != null) {
            sql.VALUES("���", "#{���,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RetailersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("����������");
        } else {
            sql.SELECT("����������");
        }
        sql.SELECT("�ṩ��Ʒ");
        sql.SELECT("���");
        sql.FROM("retailers");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Retailers record = (Retailers) parameter.get("record");
        RetailersExample example = (RetailersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("retailers");
        
        if (record.get����������() != null) {
            sql.SET("���������� = #{record.����������,jdbcType=CHAR}");
        }
        
        if (record.get�ṩ��Ʒ() != null) {
            sql.SET("�ṩ��Ʒ = #{record.�ṩ��Ʒ,jdbcType=CHAR}");
        }
        
        if (record.get���() != null) {
            sql.SET("��� = #{record.���,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("retailers");
        
        sql.SET("���������� = #{record.����������,jdbcType=CHAR}");
        sql.SET("�ṩ��Ʒ = #{record.�ṩ��Ʒ,jdbcType=CHAR}");
        sql.SET("��� = #{record.���,jdbcType=INTEGER}");
        
        RetailersExample example = (RetailersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Retailers record) {
        SQL sql = new SQL();
        sql.UPDATE("retailers");
        
        if (record.get�ṩ��Ʒ() != null) {
            sql.SET("�ṩ��Ʒ = #{�ṩ��Ʒ,jdbcType=CHAR}");
        }
        
        if (record.get���() != null) {
            sql.SET("��� = #{���,jdbcType=INTEGER}");
        }
        
        sql.WHERE("���������� = #{����������,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RetailersExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
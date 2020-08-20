package com.alvin.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;

@Data
public class Similar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.id
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.file_name
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.line_num
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private Integer lineNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.txt
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private String txt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.similar_txt
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private String similarTxt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.commit_time
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private Date commitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column similar.txt_option
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private String txtOption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    public static Similar.Builder builder() {
        return new Similar.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private Similar obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder() {
            this.obj = new Similar();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.id
         *
         * @param id the value for similar.id
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.file_name
         *
         * @param fileName the value for similar.file_name
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder fileName(String fileName) {
            obj.setFileName(fileName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.line_num
         *
         * @param lineNum the value for similar.line_num
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder lineNum(Integer lineNum) {
            obj.setLineNum(lineNum);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.txt
         *
         * @param txt the value for similar.txt
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder txt(String txt) {
            obj.setTxt(txt);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.txt_option
         *
         * @param txtOption the value for similar.txt_option
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder txtOption(String txtOption) {
            obj.setTxtOption(txtOption);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.similar_txt
         *
         * @param similarTxt the value for similar.similar_txt
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder similarTxt(String similarTxt) {
            obj.setSimilarTxt(similarTxt);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column similar.commit_time
         *
         * @param commitTime the value for similar.commit_time
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Builder commitTime(Date commitTime) {
            obj.setCommitTime(commitTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public Similar build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        fileName("file_name", "fileName", "VARCHAR", false),
        lineNum("line_num", "lineNum", "INTEGER", false),
        txt("txt", "txt", "VARCHAR", false),
        similarTxt("similar_txt", "similarTxt", "VARCHAR", false),
        commitTime("commit_time", "commitTime", "TIMESTAMP", false),
        txtOption("txt_option", "txtOption", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table similar
         *
         * @mbg.generated Thu Aug 20 14:29:45 CST 2020
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}
package com.test.entity;

public class Test {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.number
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.t_number
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    private Byte tNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.b_str
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    private String bStr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.id
     *
     * @return the value of test.id
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.id
     *
     * @param id the value for test.id
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.number
     *
     * @return the value of test.number
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.number
     *
     * @param number the value for test.number
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.t_number
     *
     * @return the value of test.t_number
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public Byte gettNumber() {
        return tNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.t_number
     *
     * @param tNumber the value for test.t_number
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public void settNumber(Byte tNumber) {
        this.tNumber = tNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.b_str
     *
     * @return the value of test.b_str
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public String getbStr() {
        return bStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.b_str
     *
     * @param bStr the value for test.b_str
     *
     * @mbg.generated Thu Jan 10 11:54:13 CST 2019
     */
    public void setbStr(String bStr) {
        this.bStr = bStr == null ? null : bStr.trim();
    }
}
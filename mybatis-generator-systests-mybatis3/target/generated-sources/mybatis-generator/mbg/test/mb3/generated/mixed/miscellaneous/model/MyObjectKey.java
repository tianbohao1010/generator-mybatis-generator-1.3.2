package mbg.test.mb3.generated.mixed.miscellaneous.model;

import mbg.test.common.BaseClass;

public class MyObjectKey extends BaseClass {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.ID2
     *
     * @mbggenerated
     */
    private Integer id2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.ID1
     *
     * @mbggenerated
     */
    private Integer id1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.ID2
     *
     * @return the value of PKFIELDS.ID2
     *
     * @mbggenerated
     */
    public Integer getId2() {
        return id2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.ID2
     *
     * @param id2 the value for PKFIELDS.ID2
     *
     * @mbggenerated
     */
    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.ID1
     *
     * @return the value of PKFIELDS.ID1
     *
     * @mbggenerated
     */
    public Integer getId1() {
        return id1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.ID1
     *
     * @param id1 the value for PKFIELDS.ID1
     *
     * @mbggenerated
     */
    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MyObjectKey other = (MyObjectKey) that;
        return (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()))
            && (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        return result;
    }
}
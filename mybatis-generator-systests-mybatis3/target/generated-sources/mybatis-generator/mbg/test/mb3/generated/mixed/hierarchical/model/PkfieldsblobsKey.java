package mbg.test.mb3.generated.mixed.hierarchical.model;

public class PkfieldsblobsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.ID1
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    private Integer id1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.ID2
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    private Integer id2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.ID1
     *
     * @return the value of PKFIELDSBLOBS.ID1
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public Integer getId1() {
        return id1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.ID1
     *
     * @param id1 the value for PKFIELDSBLOBS.ID1
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.ID2
     *
     * @return the value of PKFIELDSBLOBS.ID2
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public Integer getId2() {
        return id2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.ID2
     *
     * @param id2 the value for PKFIELDSBLOBS.ID2
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
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
        PkfieldsblobsKey other = (PkfieldsblobsKey) that;
        return (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()))
            && (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        return result;
    }
}
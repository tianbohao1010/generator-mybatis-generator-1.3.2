package mbg.test.ib2j2.generated.flat.model;

public class Pkfieldsblobs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.ID1
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    private Integer id1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.ID2
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    private Integer id2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    private String firstname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.LASTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    private String lastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    private byte[] blob1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.ID1
     *
     * @return the value of PKFIELDSBLOBS.ID1
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
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
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
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
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
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
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @return the value of PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @param firstname the value for PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.LASTNAME
     *
     * @return the value of PKFIELDSBLOBS.LASTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.LASTNAME
     *
     * @param lastname the value for PKFIELDSBLOBS.LASTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.BLOB1
     *
     * @return the value of PKFIELDSBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public byte[] getBlob1() {
        return blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.BLOB1
     *
     * @param blob1 the value for PKFIELDSBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
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
        Pkfieldsblobs other = (Pkfieldsblobs) that;
        return (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()))
            && (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getBlob1() == null ? other.getBlob1() == null : this.getBlob1().equals(other.getBlob1()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getBlob1() == null) ? 0 : getBlob1().hashCode());
        return result;
    }
}
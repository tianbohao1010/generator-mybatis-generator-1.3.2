package mbg.test.mb3.generated.simpleannotated.model;

public class Fieldsblobs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.FIRSTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private String firstname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.LASTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private String lastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private byte[] blob1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB2
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private byte[] blob2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB3
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private byte[] blob3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.FIRSTNAME
     *
     * @return the value of FIELDSBLOBS.FIRSTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.FIRSTNAME
     *
     * @param firstname the value for FIELDSBLOBS.FIRSTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.LASTNAME
     *
     * @return the value of FIELDSBLOBS.LASTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.LASTNAME
     *
     * @param lastname the value for FIELDSBLOBS.LASTNAME
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB1
     *
     * @return the value of FIELDSBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public byte[] getBlob1() {
        return blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.BLOB1
     *
     * @param blob1 the value for FIELDSBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB2
     *
     * @return the value of FIELDSBLOBS.BLOB2
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public byte[] getBlob2() {
        return blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.BLOB2
     *
     * @param blob2 the value for FIELDSBLOBS.BLOB2
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public void setBlob2(byte[] blob2) {
        this.blob2 = blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB3
     *
     * @return the value of FIELDSBLOBS.BLOB3
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public byte[] getBlob3() {
        return blob3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.BLOB3
     *
     * @param blob3 the value for FIELDSBLOBS.BLOB3
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public void setBlob3(byte[] blob3) {
        this.blob3 = blob3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
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
        Fieldsblobs other = (Fieldsblobs) that;
        return (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", blob1=").append(blob1);
        sb.append(", blob2=").append(blob2);
        sb.append(", blob3=").append(blob3);
        sb.append("]");
        return sb.toString();
    }
}
package mbg.test.mb3.generated.mixed.conditional.model;

import java.io.Serializable;

public class FieldsblobsWithBLOBs extends Fieldsblobs implements Serializable {
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
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private static final long serialVersionUID = 1L;

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
        FieldsblobsWithBLOBs other = (FieldsblobsWithBLOBs) that;
        return (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getBlob1() == null ? other.getBlob1() == null : this.getBlob1().equals(other.getBlob1()))
            && (this.getBlob2() == null ? other.getBlob2() == null : this.getBlob2().equals(other.getBlob2()))
            && (this.getBlob3() == null ? other.getBlob3() == null : this.getBlob3().equals(other.getBlob3()));
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
        result = prime * result + ((getBlob1() == null) ? 0 : getBlob1().hashCode());
        result = prime * result + ((getBlob2() == null) ? 0 : getBlob2().hashCode());
        result = prime * result + ((getBlob3() == null) ? 0 : getBlob3().hashCode());
        return result;
    }
}
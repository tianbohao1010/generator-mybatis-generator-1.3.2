package mbg.test.ib2j2.generated.hierarchical.model;

public class AwfulTableKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awful table.CuStOmEr iD
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    private Integer customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awful table.CuStOmEr iD
     *
     * @return the value of awful table.CuStOmEr iD
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awful table.CuStOmEr iD
     *
     * @param customerId the value for awful table.CuStOmEr iD
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
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
        AwfulTableKey other = (AwfulTableKey) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        return result;
    }
}
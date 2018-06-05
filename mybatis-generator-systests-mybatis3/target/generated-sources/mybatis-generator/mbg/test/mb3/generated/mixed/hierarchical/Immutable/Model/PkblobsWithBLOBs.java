package mbg.test.mb3.generated.mixed.hierarchical.Immutable.Model;

public class PkblobsWithBLOBs extends PkblobsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private byte[] blob1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.BLOB2
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private byte[] blob2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.CHARACTERLOB
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    private String characterlob;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public PkblobsWithBLOBs(Integer id, byte[] blob1, byte[] blob2, String characterlob) {
        super(id);
        this.blob1 = blob1;
        this.blob2 = blob2;
        this.characterlob = characterlob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.BLOB1
     *
     * @return the value of PKBLOBS.BLOB1
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public byte[] getBlob1() {
        return blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.BLOB2
     *
     * @return the value of PKBLOBS.BLOB2
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public byte[] getBlob2() {
        return blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.CHARACTERLOB
     *
     * @return the value of PKBLOBS.CHARACTERLOB
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    public String getCharacterlob() {
        return characterlob;
    }
}
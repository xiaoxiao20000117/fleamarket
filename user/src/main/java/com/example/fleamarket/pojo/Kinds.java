package com.example.fleamarket.pojo;

import java.io.Serializable;

public class Kinds implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kinds.id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kinds.name
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kinds.id
     *
     * @return the value of kinds.id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kinds.id
     *
     * @param id the value for kinds.id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kinds.name
     *
     * @return the value of kinds.name
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kinds.name
     *
     * @param name the value for kinds.name
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.example.fleamarket.pojo;

import java.io.Serializable;

public class History implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.user_id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.goods_id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.id
     *
     * @return the value of history.id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.id
     *
     * @param id the value for history.id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.user_id
     *
     * @return the value of history.user_id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.user_id
     *
     * @param userId the value for history.user_id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.goods_id
     *
     * @return the value of history.goods_id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.goods_id
     *
     * @param goodsId the value for history.goods_id
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
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
        sb.append(", userId=").append(userId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
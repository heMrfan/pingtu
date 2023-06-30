package com.itheima.sure;

import java.io.Serial;
import java.io.Serializable;

public class CCOO implements Serializable {



    private static final long serialVersionUID = -9118193590029779758L;

    private int[][] initImage;
    private int step;
    private int x;
    private int y;
    private String path;


    public CCOO() {
    }

    public CCOO(int[][] initImage, int step, int x, int y, String path) {
        this.initImage = initImage;
        this.step = step;
        this.x = x;
        this.y = y;
        this.path = path;
    }

    /**
     * 获取
     * @return initImage
     */
    public int[][] getInitImage() {
        return initImage;
    }

    /**
     * 设置
     * @param initImage
     */
    public void setInitImage(int[][] initImage) {
        this.initImage = initImage;
    }

    /**
     * 获取
     * @return step
     */
    public int getStep() {
        return step;
    }

    /**
     * 设置
     * @param step
     */
    public void setStep(int step) {
        this.step = step;
    }

    /**
     * 获取
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    public String toString() {
        return "CCOO{initImage = " + initImage + ", step = " + step + ", x = " + x + ", y = " + y + ", path = " + path + "}";
    }
}

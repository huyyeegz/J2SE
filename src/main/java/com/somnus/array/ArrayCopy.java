/**
 * 
 */
package com.somnus.array;

import java.util.Arrays;

/** 
 * @Title: ArrayCopy.java 
 * @Package com.somnus.array 
 * @Description: TODO
 * @author Somnus
 * @date 2015年5月14日 下午10:21:24 
 * @version V1.0 
 */
public class ArrayCopy {
	public static void main(String[] args) {
        int[] ids1 = { 1, 2, 3, 4, 5 };
        int[] ids2 = new int[6];
        System.arraycopy(ids1, 1, ids2, 0, 3);
        /*[2, 3, 4, 0, 0, 0]*/
        System.out.println(Arrays.toString(ids2));
         
        
        int[] idsa = { 1, 2, 3, 4, 5 };
        int[] idsb = new int[6];
        /*[0, 1, 2, 3, 0, 0]*/
        System.arraycopy(idsa, 0, idsb, 1, 3);
        System.out.println(Arrays.toString(idsb));
    }

}

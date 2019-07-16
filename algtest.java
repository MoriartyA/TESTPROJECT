/**
 * 
 */
package com.main;

import com.sictech.bia.cal.BiaAlgInMsg;
import com.sictech.bia.cal.BiaAlgOutMsg;
import com.sictech.bia.cal.BiaAlgSexTypeEnum;
import com.sictech.bia.cal.BiaAlgErrTypeEnum;
import com.sictech.bia.cal.BiaAlgCal;

/**
 * @Title: BiaAlgTj
 * @Class: algtest
 * @Description:
 * @Copyright: Copyright (c) 2019
 * @Company: SIC
 * @author: axy
 * @date 2019年7月3日上午8:56:33
 */

public class algtest {

	/**
	 *  @ 主函数
	 */
	public static void main(String[] args) {
		
		BiaAlgInMsg algInMsg = new BiaAlgInMsg();
		BiaAlgSexTypeEnum p1 = BiaAlgSexTypeEnum.FEMALE;
		BiaAlgOutMsg algOutMsg = new BiaAlgOutMsg();
		
		algInMsg.Sex = p1;
		algInMsg.Age = 220;
		algInMsg.Height = 180;
		algInMsg.Weight = 5500;
		algInMsg.Impedance = 550;
		
		BiaAlgCal BiaAlg = new BiaAlgCal();
		
		
		BiaAlg.CalBodyCompositionAlg(algInMsg);
		
		
		algOutMsg = BiaAlg.getBiaAlgOutMsg();
		
		
		System.out.println("ERRFLAG:" + algOutMsg.Err);
		System.out.println("BFR:" + algOutMsg.BFR);
	}
}



/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.pasta.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_MatchWHTax
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_C_MatchWHTax extends PO implements I_C_MatchWHTax, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20110904L;

    /** Standard Constructor */
    public X_C_MatchWHTax (Properties ctx, int C_MatchWHTax_ID, String trxName)
    {
      super (ctx, C_MatchWHTax_ID, trxName);
      /** if (C_MatchWHTax_ID == 0)
        {
			setC_MatchWHTax_ID (0);
			setC_Payment_ID (0);
			setC_WHTaxTrans_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_MatchWHTax (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_MatchWHTax[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Match Withholding Tax.
		@param C_MatchWHTax_ID Match Withholding Tax	  */
	public void setC_MatchWHTax_ID (int C_MatchWHTax_ID)
	{
		if (C_MatchWHTax_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MatchWHTax_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MatchWHTax_ID, Integer.valueOf(C_MatchWHTax_ID));
	}

	/** Get Match Withholding Tax.
		@return Match Withholding Tax	  */
	public int getC_MatchWHTax_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MatchWHTax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException
    {
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_Name)
			.getPO(getC_Payment_ID(), get_TrxName());	}

	/** Set Payment.
		@param C_Payment_ID 
		Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID)
	{
		if (C_Payment_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
	}

	/** Get Payment.
		@return Payment identifier
	  */
	public int getC_Payment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.pasta.model.I_C_WHTaxTrans getC_WHTaxTrans() throws RuntimeException
    {
		return (org.pasta.model.I_C_WHTaxTrans)MTable.get(getCtx(), org.pasta.model.I_C_WHTaxTrans.Table_Name)
			.getPO(getC_WHTaxTrans_ID(), get_TrxName());	}

	/** Set Withholding Tax Transaction.
		@param C_WHTaxTrans_ID Withholding Tax Transaction	  */
	public void setC_WHTaxTrans_ID (int C_WHTaxTrans_ID)
	{
		if (C_WHTaxTrans_ID < 1) 
			set_Value (COLUMNNAME_C_WHTaxTrans_ID, null);
		else 
			set_Value (COLUMNNAME_C_WHTaxTrans_ID, Integer.valueOf(C_WHTaxTrans_ID));
	}

	/** Get Withholding Tax Transaction.
		@return Withholding Tax Transaction	  */
	public int getC_WHTaxTrans_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_WHTaxTrans_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}
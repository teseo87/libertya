/*
 * @(#)MMPCProfileBOMSelected.java   13.jun 2007  Versión 2.2
 *
 *    El contenido de este fichero está sujeto a la  Licencia Pública openXpertya versión 1.1 (LPO)
 * en tanto en cuanto forme parte íntegra del total del producto denominado:  openXpertya, solución 
 * empresarial global , y siempre según los términos de dicha licencia LPO.
 *    Una copia  íntegra de dicha  licencia está incluida con todas  las fuentes del producto.
 *    Partes del código son copyRight (c) 2002-2007 de Ingeniería Informática Integrada S.L., otras 
 * partes son  copyRight (c)  2003-2007 de  Consultoría y  Soporte en  Redes y  Tecnologías  de  la
 * Información S.L.,  otras partes son copyRight (c) 2005-2006 de Dataware Sistemas S.L., otras son
 * copyright (c) 2005-2006 de Indeos Consultoría S.L., otras son copyright (c) 2005-2006 de Disytel
 * Servicios Digitales S.A., y otras  partes son  adaptadas, ampliadas,  traducidas, revisadas  y/o 
 * mejoradas a partir de código original de  terceros, recogidos en el ADDENDUM  A, sección 3 (A.3)
 * de dicha licencia  LPO,  y si dicho código es extraido como parte del total del producto, estará
 * sujeto a su respectiva licencia original.  
 *    Más información en http://www.openxpertya.org/ayuda/Licencia.html
 */



//package org.openXpertya.mfg.model;
package openXpertya.model;

import java.sql.*;

import java.util.*;

import org.openXpertya.model.*;
import org.openXpertya.util.*;

//import org.openXpertya.mfg.model.*;

/**
 *      Project Line Model
 *
 *      @author Fundesle
 *      @version $Id: MProjectLine.java,v 2.0 $
 */
public class MMPCProfileBOMSelected extends X_MPC_ProfileBOM_Selected {

    /**
     *      Standard Constructor
     *      @param ctx context
     *      @param C_ProjectLine_ID id
     * @param MPC_ProfileBOM_Selected_ID
     * @param trxName
     */
    public MMPCProfileBOMSelected(Properties ctx, int MPC_ProfileBOM_Selected_ID, String trxName) {

        super(ctx, MPC_ProfileBOM_Selected_ID, trxName);

        if (MPC_ProfileBOM_Selected_ID == 0) {

            // setC_Project_ID (0);
            // setC_ProjectLine_ID (0);
            //                      setLine (0);
            //                      setIsPrinted(true);
            //                      setProcessed(false);
            //                      setInvoicedAmt (Env.ZERO);
            //                      setInvoicedQty (Env.ZERO);
            //                      setPlannedAmt (Env.ZERO);
            //                      setPlannedMarginAmt (Env.ZERO);
            //                      setPlannedPrice (Env.ZERO);
            //                      setPlannedQty (Env.ZERO);
            // setM_Attribute_ID();
        }

    }		// MProjectLine

    /**
     *      Load Constructor
     *      @param ctx context
     *      @param rs result set
     * @param trxName
     */
    public MMPCProfileBOMSelected(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }		// MProjectLine

    /**
     *      Parent Constructor
     *      @param project parent
     *
     * @param profile
     */
    public MMPCProfileBOMSelected(MMPCProfileBOM profile) {

        this(profile.getCtx(), 0, null);
        setClientOrg(profile.getAD_Client_ID(), profile.getAD_Org_ID());

        // setC_ProjectLine_ID (0);                                                // PK
        setMPC_ProfileBOM_ID(profile.getMPC_ProfileBOM_ID());		// Parent
        setLine(getNextLine());

    }									// MProjectLine

    /**
     *      Set AD_Org_ID
     *      @param AD_Org_ID Org ID
     */
    public void setAD_Org_ID(int AD_Org_ID) {
        super.setAD_Org_ID(AD_Org_ID);
    }		// setAD_Org_ID

    /**
     *      Get the next Line No
     *      @return next line no
     */
    private int getNextLine() {
        return DB.getSQLValue("MPC_ProfileBOM_Selected", "SELECT COALESCE(MAX(Line),0)+10 FROM MPC_ProfileBOM_Selected WHERE MPC_ProfileBOM_ID=?", getMPC_ProfileBOM_ID());
    }		// getLineFromProject

//  /
//       Set Product, committed qty, etc.
//       @param pi project issue
//  /
//  public void setMProjectIssue (MProjectIssue pi)
//  {
//       setC_ProjectIssue_ID(pi.getC_ProjectIssue_ID());
//       setM_Product_ID(pi.getM_Product_ID());
//       setCommittedQty(pi.getMovementQty());
//       if (getDescription() != null)
//               setDescription(pi.getDescription());
//  }     //      setMProjectIssue
//
//  /
//       Set PO
//       @param C_OrderPO_ID po id
//  /
//  public void setC_OrderPO_ID (int C_OrderPO_ID)
//  {
//       super.setC_OrderPO_ID(C_OrderPO_ID);
//  }     //      setC_OrderPO_ID
}	// MProjectLine



/*
 * @(#)MMPCProfileBOMSelected.java   13.jun 2007
 * 
 *  Fin del fichero MMPCProfileBOMSelected.java
 *  
 *  Versión 2.2  - Fundesle (2007)
 *
 */


//~ Formateado de acuerdo a Sistema Fundesle en 13.jun 2007

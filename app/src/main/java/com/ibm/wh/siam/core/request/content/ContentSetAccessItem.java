/**
 *
 * @Author Match Grun.
 */
package com.ibm.wh.siam.core.request.content;

import java.io.Serializable;
import java.util.Date;

import com.ibm.wh.siam.core.annotations.SiamString;
import com.ibm.wh.siam.core.dto.BaseSiamObject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Match Grun
 *
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ContentSetAccessItem
extends BaseSiamObject
implements Serializable
{
   private static final long serialVersionUID = 1L;

   @SiamString(empty = false)
   private String contentSetId;

   @SiamString(empty = false)
   private String accessorId;

   @SiamString(maxLength=40, empty = false)
   private String contentAccessId;

   private Date startDate;
   private Date endDate;
   private String status;

}

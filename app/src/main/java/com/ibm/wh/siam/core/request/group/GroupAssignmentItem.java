/**
 *
 * @Author Match Grun.
 */
package com.ibm.wh.siam.core.request.group;

import java.io.Serializable;

import com.ibm.wh.siam.core.annotations.SiamString;

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
public class GroupAssignmentItem
implements Serializable
{
    private static final long serialVersionUID = 1L;

    @SiamString(empty=false, maxLength=20)
    private String operation = "";
    @SiamString(empty=false)
    private String organizationId;
    @SiamString(empty=false)
    private String groupId;

}

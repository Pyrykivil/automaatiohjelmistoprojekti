package aalto.ELECC8204.codegen.HelloOPCUA;

import org.opcfoundation.ua.builtintypes.ExpandedNodeId;

/**
 * Generated on 2026-05-06 10:54:59
 */
public class Ids {
  public static final ExpandedNodeId HelloObjectType_Variable = init("nsu=HelloOPCUA;i=2");

  public static final ExpandedNodeId HelloObjectType = init("nsu=HelloOPCUA;i=1");

  public static final ExpandedNodeId CoordinateType_Z = init("nsu=HelloOPCUA;i=2003");

  public static final ExpandedNodeId CoordinateType = init("nsu=HelloOPCUA;i=2000");

  public static final ExpandedNodeId CoordinateType_Y = init("nsu=HelloOPCUA;i=2002");

  public static final ExpandedNodeId CoordinateType_X = init("nsu=HelloOPCUA;i=2001");

  private static ExpandedNodeId init(String id) {
    return ExpandedNodeId.parseExpandedNodeId(id);
  }
}

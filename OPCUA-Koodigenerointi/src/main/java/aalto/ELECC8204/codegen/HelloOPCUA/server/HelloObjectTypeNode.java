package aalto.ELECC8204.codegen.HelloOPCUA.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.server.NodeManagerUaNode;
import java.lang.Override;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=1")
public class HelloObjectTypeNode extends HelloObjectTypeNodeBase {
  protected HelloObjectTypeNode(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    // Use this method to initialize the nodes, when they are all created.
    // Note that 'super.afterCreate()' performs default initializations, so consider
    // whether your own initializations should be done before or after it.
    super.afterCreate();
  }
}

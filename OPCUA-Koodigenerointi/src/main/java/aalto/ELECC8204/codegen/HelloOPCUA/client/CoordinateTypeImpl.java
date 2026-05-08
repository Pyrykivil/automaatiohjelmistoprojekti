package aalto.ELECC8204.codegen.HelloOPCUA.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=2000")
public class CoordinateTypeImpl extends CoordinateTypeImplBase {
  protected CoordinateTypeImpl(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }
}

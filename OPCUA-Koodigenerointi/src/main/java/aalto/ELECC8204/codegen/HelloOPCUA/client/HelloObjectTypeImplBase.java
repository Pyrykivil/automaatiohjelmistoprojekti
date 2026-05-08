package aalto.ELECC8204.codegen.HelloOPCUA.client;

import aalto.ELECC8204.codegen.HelloOPCUA.HelloObjectType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=1")
public abstract class HelloObjectTypeImplBase extends BaseObjectTypeImpl implements HelloObjectType {
  protected HelloObjectTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public BaseDataVariableType getVariableNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "Variable");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public String getVariable() {
    UaVariable node = getVariableNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setVariable(String value) throws StatusException {
    UaVariable node = getVariableNode();
    if (node == null) {
      throw new RuntimeException("Setting Variable failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}

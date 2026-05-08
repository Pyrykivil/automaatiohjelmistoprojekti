package aalto.ELECC8204.codegen.HelloOPCUA.client;

import aalto.ELECC8204.codegen.HelloOPCUA.CoordinateType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=2000")
public abstract class CoordinateTypeImplBase extends BaseObjectTypeImpl implements CoordinateType {
  protected CoordinateTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public BaseDataVariableType getXNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "X");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Double getX() {
    UaVariable node = getXNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Double) value;
  }

  @Mandatory
  @Override
  public void setX(Double value) throws StatusException {
    UaVariable node = getXNode();
    if (node == null) {
      throw new RuntimeException("Setting X failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public BaseDataVariableType getYNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "Y");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Double getY() {
    UaVariable node = getYNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Double) value;
  }

  @Mandatory
  @Override
  public void setY(Double value) throws StatusException {
    UaVariable node = getYNode();
    if (node == null) {
      throw new RuntimeException("Setting Y failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public BaseDataVariableType getZNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "Z");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Double getZ() {
    UaVariable node = getZNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Double) value;
  }

  @Mandatory
  @Override
  public void setZ(Double value) throws StatusException {
    UaVariable node = getZNode();
    if (node == null) {
      throw new RuntimeException("Setting Z failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}

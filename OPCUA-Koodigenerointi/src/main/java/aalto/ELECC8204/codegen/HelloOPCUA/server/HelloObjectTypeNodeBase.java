package aalto.ELECC8204.codegen.HelloOPCUA.server;

import aalto.ELECC8204.codegen.HelloOPCUA.HelloObjectType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseObjectTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import org.opcfoundation.ua.builtintypes.DiagnosticInfo;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;
import org.opcfoundation.ua.builtintypes.StatusCode;
import org.opcfoundation.ua.builtintypes.Variant;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=1")
public abstract class HelloObjectTypeNodeBase extends BaseObjectTypeNode implements HelloObjectType {
  private static GeneratedNodeInitializer<HelloObjectTypeNode> helloObjectTypeNodeInitializer;

  protected HelloObjectTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getVariableNode());
    GeneratedNodeInitializer<HelloObjectTypeNode> impl = getHelloObjectTypeNodeInitializer();
    if(impl != null) {
      impl.init((HelloObjectTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<HelloObjectTypeNode> getHelloObjectTypeNodeInitializer() {
    return helloObjectTypeNodeInitializer;
  }

  public static void setHelloObjectTypeNodeInitializer(GeneratedNodeInitializer<HelloObjectTypeNode> helloObjectTypeNodeInitializerNewValue) {
    helloObjectTypeNodeInitializer=helloObjectTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getVariableNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "Variable");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public String getVariable() {
    UaVariable node = getVariableNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node Variable does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setVariable(String value) {
    UaVariable node = getVariableNode();
    if (node == null) {
      throw new RuntimeException("Setting Variable failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Variable failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}

package aalto.ELECC8204.codegen.HelloOPCUA;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.String;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=1")
public interface HelloObjectType extends BaseObjectType {
  String VARIABLE = "Variable";

  @Mandatory
  BaseDataVariableType getVariableNode();

  @Mandatory
  String getVariable();

  @Mandatory
  void setVariable(String value) throws StatusException;
}

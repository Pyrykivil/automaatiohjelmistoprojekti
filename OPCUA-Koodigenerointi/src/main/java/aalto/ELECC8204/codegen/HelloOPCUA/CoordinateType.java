package aalto.ELECC8204.codegen.HelloOPCUA;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.Double;
import java.lang.String;

/**
 * Generated on 2026-05-06 10:54:59
 */
@TypeDefinitionId("nsu=HelloOPCUA;i=2000")
public interface CoordinateType extends BaseObjectType {
  String X = "X";

  String Y = "Y";

  String Z = "Z";

  @Mandatory
  BaseDataVariableType getXNode();

  @Mandatory
  Double getX();

  @Mandatory
  void setX(Double value) throws StatusException;

  @Mandatory
  BaseDataVariableType getYNode();

  @Mandatory
  Double getY();

  @Mandatory
  void setY(Double value) throws StatusException;

  @Mandatory
  BaseDataVariableType getZNode();

  @Mandatory
  Double getZ();

  @Mandatory
  void setZ(Double value) throws StatusException;
}

package aalto.ELECC8204.codegen.HelloOPCUA.server;

import aalto.ELECC8204.codegen.HelloOPCUA.DataTypeDictionaryHelper;
import aalto.ELECC8204.codegen.HelloOPCUA.Serializers;
import com.prosysopc.ua.nodes.UaInstance;
import com.prosysopc.ua.server.ServerCodegenModel;
import java.lang.Class;
import java.util.ArrayList;
import java.util.List;

/**
 * Generated on 2026-05-06 10:54:59
 */
public class ServerInformationModel {
  public static final ServerCodegenModel MODEL = new ServerCodegenModel(createClassesList(), Serializers.SERIALIZERS, DataTypeDictionaryHelper.createDataTypeDictionary());

  private static List<Class<? extends UaInstance>> createClassesList() {
    ArrayList<Class<? extends UaInstance>> list = new ArrayList<Class<? extends UaInstance>>();
    list.add(HelloObjectTypeNode.class);
    list.add(CoordinateTypeNode.class);
    return list;
  }
}

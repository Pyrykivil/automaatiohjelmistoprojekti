package aalto.ELECC8204.codegen.HelloOPCUA.client;

import aalto.ELECC8204.codegen.HelloOPCUA.DataTypeDictionaryHelper;
import aalto.ELECC8204.codegen.HelloOPCUA.Serializers;
import com.prosysopc.ua.client.ClientCodegenModel;
import com.prosysopc.ua.nodes.UaInstance;
import java.lang.Class;
import java.util.ArrayList;
import java.util.List;

/**
 * Generated on 2026-05-06 10:54:59
 */
public class ClientInformationModel {
  public static final ClientCodegenModel MODEL = new ClientCodegenModel(createClassesList(), Serializers.SERIALIZERS, DataTypeDictionaryHelper.createDataTypeDictionary());

  private static List<Class<? extends UaInstance>> createClassesList() {
    ArrayList<Class<? extends UaInstance>> list = new ArrayList<Class<? extends UaInstance>>();
    list.add(HelloObjectTypeImpl.class);
    list.add(CoordinateTypeImpl.class);
    return list;
  }
}

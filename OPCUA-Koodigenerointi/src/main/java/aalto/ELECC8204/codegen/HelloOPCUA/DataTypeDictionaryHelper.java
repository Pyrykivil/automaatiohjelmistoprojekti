package aalto.ELECC8204.codegen.HelloOPCUA;

import com.prosysopc.ua.typedictionary.GeneratedDataTypeDictionary;
import java.lang.String;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;

/**
 * Generated on 2026-05-06 10:54:59
 */
public class DataTypeDictionaryHelper {
  public static GeneratedDataTypeDictionary createDataTypeDictionary() {
    GeneratedDataTypeDictionary r = new GeneratedDataTypeDictionary("HelloOPCUA");
    return r;
  }

  private static ExpandedNodeId eni(String id) {
    return ExpandedNodeId.parseExpandedNodeId(id);
  }
}

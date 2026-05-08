package aalto.ELECC8204.koodigenerointi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.xml.sax.SAXException;

import com.prosysopc.ua.ModelException;
import com.prosysopc.ua.SecureIdentityException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.nodes.UaObject;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.UaServerException;
import aalto.ELECC8204.codegen.HelloOPCUA.CoordinateType;
import aalto.ELECC8204.codegen.HelloOPCUA.HelloObjectType;
import aalto.ELECC8204.opcua.OPCUAServer;


public class KoodigenerointiServer extends OPCUAServer {
	public static int TCP_PORT = 52521;
	public static int HTTPS_PORT = 52444;
	public static String APP_NAME = "KoodigenerointiServer";
	private static final Logger logger = LogManager.getLogger(KoodigenerointiServer.class);
	
	public KoodigenerointiServer(int tcpPort, int httpsPort, String appName) throws SecureIdentityException, IOException, UaServerException, StatusException,
			ServiceException, SAXException, ModelException, URISyntaxException {
		super(tcpPort, httpsPort, appName);
		
		server.registerModel(aalto.ELECC8204.codegen.HelloOPCUA.server.ServerInformationModel.MODEL);
		URL modelURL =
				aalto.ELECC8204.codegen.HelloOPCUA.server.ServerInformationModel.class.getResource("HelloOPCUA.xml");
		server.getAddressSpace().loadModel(modelURL.toURI());
	}
	
	@Override
	protected void createAddressSpace() {
	    try {
	        NodeManagerUaNode nodeManager = new NodeManagerUaNode(
	                server, "http://www.aalto.com/OPCUA/HelloAddressSpace");
	        int index = nodeManager.getNamespaceIndex();

	        // HelloObject
	        NodeId helloId = new NodeId(index, 1);
	        HelloObjectType helloObject = nodeManager.createInstance(
	                HelloObjectType.class, "HelloObject", helloId);

	        // CoordinateType-instanssi
	        NodeId coordId = new NodeId(index, 2);
	        CoordinateType coordObject = nodeManager.createInstance(
	                CoordinateType.class, "Coord", coordId);

	        UaObject objectsFolder = server.getNodeManagerRoot().getObjectsFolder();
	        nodeManager.addNodeAndReference(objectsFolder, helloObject, Identifiers.Organizes);
	        nodeManager.addNodeAndReference(objectsFolder, coordObject, Identifiers.Organizes);
	    } catch (Exception e) {
	        logger.error(e);
	    }
	}
	
	public static void main(String[] args) throws Exception {
		logger.info("Starting KoodigenerointiServer");
		KoodigenerointiServer server = new KoodigenerointiServer(TCP_PORT, HTTPS_PORT, APP_NAME);
		server.createAddressSpace();
		server.run();
	}

}

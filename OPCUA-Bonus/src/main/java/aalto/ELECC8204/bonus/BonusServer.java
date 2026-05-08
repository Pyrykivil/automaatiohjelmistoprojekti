package aalto.ELECC8204.bonus;


import java.io.IOException;
import java.net.URISyntaxException;
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
import aalto.ELECC8204.koodigenerointi.KoodigenerointiServer;

public class BonusServer extends KoodigenerointiServer {
	public static int TCP_PORT = 52522;
	public static int HTTPS_PORT = 52446;
	public static String APP_NAME = "BonusServer";
	private static final Logger logger = LogManager.getLogger(BonusServer.class);
	
	public BonusServer(int tcpPort, int httpsPort, String appName) throws SecureIdentityException, IOException, UaServerException, StatusException,
			ServiceException, SAXException, ModelException, URISyntaxException {
		super(tcpPort, httpsPort, appName);
	}
	
	@Override
	protected void createAddressSpace() {
	    try {
	        NodeManagerUaNode nodeManager = new NodeManagerUaNode(
	                server, "http://www.aalto.com/OPCUA/HelloAddressSpace");
	        int index = nodeManager.getNamespaceIndex();

	        // CoordinateType-instanssi
	        NodeId coordId2 = new NodeId(index, 2);
	        CoordinateType coordObject2 = nodeManager.createInstance(
	                CoordinateType.class, "Coord", coordId2);
	        // CoordinateType-instanssi
	        NodeId coordId3 = new NodeId(index, 3);
	        CoordinateType coordObject3 = nodeManager.createInstance(
	                CoordinateType.class, "Coord", coordId3);
	        // CoordinateType-instanssi
	        NodeId coordId4 = new NodeId(index, 4);
	        CoordinateType coordObject4 = nodeManager.createInstance(
	                CoordinateType.class, "Coord", coordId4);
	        // CoordinateType-instanssi
	        NodeId coordId5 = new NodeId(index, 5);
	        CoordinateType coordObject5 = nodeManager.createInstance(
	                CoordinateType.class, "Coord", coordId5);
	        // CoordinateType-instanssi
	        NodeId coordId6 = new NodeId(index, 6);
	        CoordinateType coordObject6 = nodeManager.createInstance(
	                CoordinateType.class, "Coord", coordId6);

	        UaObject objectsFolder = server.getNodeManagerRoot().getObjectsFolder();
	        nodeManager.addNodeAndReference(objectsFolder, coordObject2, Identifiers.Organizes);
	        nodeManager.addNodeAndReference(objectsFolder, coordObject3, Identifiers.Organizes);
	        nodeManager.addNodeAndReference(objectsFolder, coordObject4, Identifiers.Organizes);
	        nodeManager.addNodeAndReference(objectsFolder, coordObject5, Identifiers.Organizes);
	        nodeManager.addNodeAndReference(objectsFolder, coordObject6, Identifiers.Organizes);
	        coordObject2.setX(1.0);
	        coordObject3.setX(2.0);
	        coordObject4.setX(3.0);
	        coordObject5.setX(4.0);
	        coordObject6.setX(5.0);
	    } catch (Exception e) {
	        logger.error(e);
	    }
	}
	
	public static void main(String[] args) throws Exception {
		logger.info("Starting BonusServer");
		BonusServer server = new BonusServer(TCP_PORT, HTTPS_PORT, APP_NAME);
		server.createAddressSpace();
		server.run();
	}

}

package befaster.runner;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class ConfigNotFoundException extends Exception {
    ConfigNotFoundException(String message) {
        super(message);
    }

}

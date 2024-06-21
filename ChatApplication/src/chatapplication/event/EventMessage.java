
package chatapplication.event;

import chatapplication.model.Model_Message;

public interface EventMessage {
    
    public void callMessage(Model_Message message);
}

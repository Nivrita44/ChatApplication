
package chatapplication.event;

public interface EventFileSender {
    
    public void onSending(double percentage);

    public void onStartSending();

    public void onFinish();
}

package Task1;

public class Television {
    int currentChannel;
    int maxChannels;

    public Television(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public Television(int currentChannel, int maxChannels) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
    }
    void setChanel(int chanel){
        this.currentChannel = chanel;
    }
    public void nextChannel() {
        if (currentChannel < maxChannels) {
            currentChannel++;
        } else {
            currentChannel = 1;
        }
        displayChannel();
    }

    public void goToChannel(int channelNumber) {
        if (channelNumber > 0 && channelNumber <= maxChannels) {
            currentChannel = channelNumber;
            displayChannel();
        } else {
            System.out.println("Invalid channel number");
        }
    }

    public void displayChannel() {
        System.out.println("Current channel: " + currentChannel + " - " + getChannelName(currentChannel));
    }

    private String getChannelName(int channelNumber) {
        switch (channelNumber) {
            case 1:
                return "BBC News";
            case 2:
                return "CNN";
            case 3:
                return "Discovery Channel";
            case 4:
                return "Bishkek News";
            case 5:
                return "Kyrgystan today";
            default:
                return "Unknown channel";
        }
    }


    public void previousChannel() {
        if (currentChannel > 1) {
            currentChannel--;
        } else {
            currentChannel = maxChannels;
        }
        displayChannel();
    }
}

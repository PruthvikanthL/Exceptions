package applications_of_exceptions;

public class VideoPlayer {
    String deviceType;
    String resolution;

    public VideoPlayer(String deviceType, String resolution) {
        this.deviceType=deviceType;
        this.resolution=resolution;
    }
    public void playVideo() {
        try {
            if (!deviceType.equalsIgnoreCase("mobile") && !deviceType.equalsIgnoreCase("laptop")) {
                throw new Exception("Unsupported device: " + deviceType);
            }
            System.out.println("Device: " + deviceType + " is supported.");
            try {
                if (!resolution.equalsIgnoreCase("720p") &&
                        !resolution.equalsIgnoreCase("1080p") &&
                        !resolution.equalsIgnoreCase("4K")) {
                    throw new IllegalArgumentException("Unsupported resolution: " + resolution);
                }
                System.out.println("Playing video at " + resolution + " resolution.");
            } catch (IllegalArgumentException e) {
                System.out.println("Resolution Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Device Compatibility Error: " + e.getMessage());
        }
        System.out.println("Video playback setup complete.");
    }
}

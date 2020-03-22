package designmodel.flyweight;

import java.util.ArrayList;
import java.util.List;

public class DeviceFactory {
	private List<NetworkDevice> devices;

	private int totalTerminal = 0;

	public DeviceFactory() {
		devices = new ArrayList<NetworkDevice>();
		
		devices.add(new Switch("Cisco - WS - C2950 - 24"));

		devices.add(new Switch("TP-LINK-HF8M"));
	}

	public NetworkDevice getNetworkDevice(String key) {
		if ("cisco".equalsIgnoreCase(key)) {
			this.totalTerminal++;
			return devices.get(0);
		} else if ("tp".equalsIgnoreCase(key)) {
			this.totalTerminal++;
			return devices.get(1);
		} else {
			return null;
		}
	}

	public int getTotalTerminal() {
		return this.totalTerminal;
	}

	public int getTotalDevice() {
		return this.devices.size();
	}

}

package computer;
class Computer{
    Ram ram;
    HardDisk disk;

	public Computer(Ram ram, HardDisk disk){
		this.ram = ram;
		this.disk = disk;
	}

}

class Ram{
}

class HardDisk{
}

class UseComputer{
	public static void main(String[] args){
		Computer com = new Computer(new Ram(), new HardDisk());
	}
}
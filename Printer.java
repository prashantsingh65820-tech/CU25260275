interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class PrinterScanner implements Printer, Scanner {
    private String machineName;
    private int machineId;

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public int getMachineId() {
        return machineId;
    }

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }

    public static void main(String[] args) {
        PrinterScanner m = new PrinterScanner();

        m.setMachineName("HP Printer");
        m.setMachineId(101);

        System.out.println("Machine: " + m.getMachineName());
        System.out.println("ID: " + m.getMachineId());

        m.print();
        m.scan();
    }
}
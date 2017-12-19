package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable{

	private Processor processor;
	private ComputerCase computerCase;
	public final static int MAX_PERIPHERAL = 3;
	private Peripheral[] peripherals = new Peripheral[MAX_PERIPHERAL];
	
	private int teller;

	public ComputerSystem() {

	}

	public Peripheral[] getPeripherals() {
		return peripherals;
	}

	public void setPeripherals(Peripheral[] peripherals) {
		this.peripherals = peripherals;
	}
	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public void addPeripheral(Peripheral peripheral) {
		if (teller <= 2) {
			peripherals[teller] = peripheral;
		teller++;
		} else {
throw new TooManyPeripheralsException("Overschreden");
		}

	}
	public void removePeripheral (String articleNumber) {
		int locatie=-1;
	
		for ( int i = 0 ; i < peripherals.length; i++) {
			if (peripherals[i] != null && peripherals[i].getArticleNumber() == articleNumber) {
				locatie = i;
				teller--;
			}
		}
		if (locatie != -1) {
			peripherals[locatie] = null;
		}
		
	}
	public int getNumberOfPeripherals() {
		return teller;
	}

	@Override
	public double totalPriceExcl() {
		double subtotaal = 0;
		
		subtotaal= subtotaal + getComputerCase().getPrice() + getProcessor().getPrice();
		
		for (Peripheral peripheral : peripherals) {
			if (peripheral != null) {
				subtotaal = subtotaal + peripheral.getPrice();
			}
		}
		
		return subtotaal;
	}

	@Override
	public String toString() {
		StringBuilder tekst  = new StringBuilder();
		
		tekst.append("Computercase:\n");
		tekst.append(computerCase.toString()+"\n");
		tekst.append("Processor:\n");
		tekst.append(processor.toString()+"\n");
		
		int volgnummer=0;
		
		for (Peripheral peripheral : peripherals) {
			if (peripheral != null) {
				volgnummer++;
				tekst.append("Randapparaat "+ volgnummer + ":");
				tekst.append(peripheral.toString()+"\n");
				
			}
		}
		tekst.append("TOTAAL EXCL: " + totalPriceExcl() + "\n");
		tekst.append("TOTAAL INCL: " + totalPriceIncl() + "\n");
		return tekst.toString();
	}
	
	





}

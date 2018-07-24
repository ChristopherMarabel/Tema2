package dVDPlayer;

	class DVDPlayer {
		
		boolean canRecord = false;
		
		void recordDVD() {
			System.out.println("DVD recording");
		}
		void playDVD() {									// Se debe definir el método playDVD.
			System.out.println("DVD playing");
		}
	}

		class DVDPlayerTestDrive{
			public static void main(String [] args) {
				
				DVDPlayer d = new DVDPlayer();
				d.canRecord = true;
				d.playDVD();
				
				if(d.canRecord == true) {
					d.recordDVD();
				}
			}
		}
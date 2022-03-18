package skyro.company;

    public abstract class Transport implements StationInterface {
        private final String modelName;
        private final int wheelsCount;

        protected Transport(String modelName, int wheelsCount) {
            this.modelName = modelName;
            this.wheelsCount = wheelsCount;
        }

        @Override
        public String getModelName() {
            return modelName;
        }

        @Override
        public int getWheelsCount() {
            return wheelsCount;
        }

        @Override
        public void updateTyre(int numberOfWheel) {
            System.out.println("Меняем покрышку " + numberOfWheel);
        }
    }


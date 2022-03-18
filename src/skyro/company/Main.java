package skyro.company;
import java.util.List;

        public class Main {

            private static ServiceStation station = new ServiceStation();

            public static void main(String[] args) {
                List.of(
                                new Car("car1", 4),
                                new Car("car2", 4),
                                new Bycicle("bycicle1"),
                                new Bycicle("bycicle2"),
                                new Truck ("truck1",6),
                                new Truck ("truck2",6)
                        )
                        .forEach(stationInterface -> station.check(stationInterface));

            }
        }


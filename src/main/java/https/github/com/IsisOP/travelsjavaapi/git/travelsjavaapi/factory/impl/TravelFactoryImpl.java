package https.github.com.IsisOP.travelsjavaapi.git.travelsjavaapi.factory.impl;

import https.github.com.IsisOP.travelsjavaapi.git.travelsjavaapi.enumeration.TravelTypeEnum;
import https.github.com.IsisOP.travelsjavaapi.git.travelsjavaapi.factory.TravelFactory;
import https.github.com.IsisOP.travelsjavaapi.git.travelsjavaapi.model.Travel;

public class TravelFactoryImpl implements TravelFactory {
    @Override
    public Travel createTravel (String type) {

        if (TravelTypeEnum.ONE_WAY.getValue().equals(type)) {
            return new Travel(TravelTypeEnum.ONE_WAY);
        } else if (TravelTypeEnum.MULTI_CITY.getValue().equals(type)) {
            return new Travel(TravelTypeEnum.MULTI_CITY);
        }

        return new Travel(TravelTypeEnum.RETURN);
    }
}

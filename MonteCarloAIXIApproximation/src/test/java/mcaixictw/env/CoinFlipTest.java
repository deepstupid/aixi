package mcaixictw.env;

import mcaixictw.Environment;
import mcaixictw.RunAgentTest;
import mcaixictw.environments.CoinFlipEnv;
import org.junit.Test;

/**
 * Created by me on 7/4/16.
 */
public class CoinFlipTest extends RunAgentTest {



    @Override public Environment environment() {
        double p_biased_coin = 0.7;
        return new CoinFlipEnv(p_biased_coin);
    }

    @Override
    protected String name() {
        return "CoinFlipTraining";
    }
}

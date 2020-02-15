package chapter8.sec2.listing10

import arrow.core.Either
import chapter8.sec2.FailedCase
import chapter8.sec2.SuccessCount

//tag::init[]
typealias TestCases = Int

typealias Result = Either<Pair<FailedCase, SuccessCount>, SuccessCount>

data class Prop(val run: (TestCases) -> Result)
//end::init[]

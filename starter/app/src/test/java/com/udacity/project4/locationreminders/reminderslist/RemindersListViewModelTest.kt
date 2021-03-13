package com.udacity.project4.locationreminders.reminderslist

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.udacity.project4.locationreminders.MainCoroutineRule
import com.udacity.project4.locationreminders.data.FakeDataSource
import com.udacity.project4.locationreminders.getOrAwaitValue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.context.stopKoin
import org.mockito.Mockito

@RunWith(AndroidJUnit4::class)
@ExperimentalCoroutinesApi
class RemindersListViewModelTest {
    //TODO: provide testing to the RemindersListViewModel and its live data objects
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()


    private lateinit var dataSource: FakeDataSource

    private lateinit var viewModel: RemindersListViewModel

    @Before
    fun setUp() {
        val applicationMock = Mockito.mock(Application::class.java)
        dataSource = FakeDataSource()
        viewModel = RemindersListViewModel(applicationMock, dataSource)
    }

    @After
    fun tearDown() {
        stopKoin()
    }
//
//    @Test
//    fun loadReminders_loading() = runBlockingTest {
//        // Pause dispatcher so you can verify initial values.
//        mainCoroutineRule.pauseDispatcher()
//
//        // Load the reminders in the view model.
//        viewModel.loadReminders()
//
//        // Then assert that the progress indicator is shown.
//        assertThat(viewModel.showLoading.getOrAwaitValue(), `is`(true))
//
//        // Execute pending coroutines actions.
//        mainCoroutineRule.resumeDispatcher()
//
//        // Then assert that the progress indicator is hidden.
//        assertThat(viewModel.showLoading.getOrAwaitValue(), `is`(false))
//    }
//
//    @Test
//    fun loadReminders_withSuccess() = runBlockingTest {
//        // Tells the data source to not fail the execution.
//        dataSource.returnError = false
//        val expected = testReminders.map { it.asDomain() }
//
//        // Load the reminders in the view model.
//        viewModel.loadReminders()
//
//        // Then assert that the result matches the expectec list value.
//        assertThat(viewModel.remindersList.getOrAwaitValue(), `is`(expected))
//    }
//
//    @Test
//    fun loadReminders_error() = runBlockingTest {
//        // Tells the data source to not fail the execution.
//        dataSource.returnError = true
//
//        // Pause dispatcher so you can verify initial values.
//        mainCoroutineRule.pauseDispatcher()
//
//        // Load the reminders in the view model.
//        viewModel.loadReminders()
//
//        /*// Then assert that the progress indicator is shown.
//        assertThat(viewModel.showSnackBar.getOrAwaitValue(), nullValue())*/
//
//        // Execute pending coroutines actions.
//        mainCoroutineRule.resumeDispatcher()
//
//        // Then assert that the progress indicator is hidden.
//        assertThat(viewModel.showSnackBar.getOrAwaitValue(), `is`("Test Exception"))
//    }
}